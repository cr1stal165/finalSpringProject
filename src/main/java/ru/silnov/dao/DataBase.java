package ru.silnov.dao;

import org.springframework.stereotype.Component;
import ru.silnov.models.NewsPost;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase {
    private static int idCount;
    private List<NewsPost> list;

    {
        list = new ArrayList<>();

        list.add(new NewsPost(++idCount, "COP26: Draft deal calls for stronger carbon cutting targets by end of 2022",
                "The document says vulnerable nations must get more help to cope with the deadly impacts of global warming.\n" +
                        "\n" +
                        "It also says countries should submit long-term strategies for reaching net-zero by the end of next year.\n" +
                        "\n" +
                        "Critics have said the draft pact does not go far enough but others welcomed its focus on the 1.5C target.\n" +
                        "\n" +
                        "The document, which has been published by the UK COP26 presidency, will have to be negotiated and agreed by countries attending the talks."));
        list.add(new NewsPost(++idCount, "Cross our fingers and hope",
                "Loss and damage - an issue of key importance to the developing world - has been included in the draft, calling for more support from developed countries and other organisations to address the damage caused by extreme weather and rising seas in vulnerable nations.\n" +
                        "\n" +
                        "It also recognises that more finance is needed for developing countries beyond the long-promised $100bn a year by 2020, which will not be delivered until at least 2022.\n" +
                        "\n" +
                        "But campaigners said these parts of the text were weak and were essentially a \"box ticking exercise\".\n" +
                        "\n" +
                        "The document also calls on countries to accelerate the phasing out of coal and subsidies for fossil fuels - but has no firm dates or targets on this issue.\n" +
                        "\n" +
                        "\"This draft deal is not a plan to solve the climate crisis, it's an agreement that we'll all cross our fingers and hope for the best,\" said Jennifer Morgan from Greenpeace International."));

    }

    public List<NewsPost> index() {
        return list;
    }

    public void save(NewsPost newsPost) {
        newsPost.setId(++idCount);
        list.add(newsPost);
    }
}