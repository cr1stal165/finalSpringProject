# Запуск проекта
1) Скачиваем сервер apache Tomcat  с оффициального сайта: https://tomcat.apache.org/download-80.cgi . 
Заходим на сайт , листаем ниже и находим подраздел Binary Distributions там чуть нижу находится Core и чуть ниже нажимаем на zip
и распаковываем на рабочий стол или куда-нибудь еще.
2) Заходим в IDEA , сверху нажимаем на Run и потом нажимаем на Edit configuration , потом нажимаем слева на +
и выбираем Tomcat Server и выбираем local. 
Далее нажимаем на Configure , в открывшемся окне нажимаем слева на + , и в открывшимся окошке слева от надписи Tomcat Home указываем 
путь до распакованной папки с сервером. Потом нажимаем ок и нас переносит обратно в edit cinfiguration и справа снизу будет кнопка fix
нажимаем на нее и выбираем :war_exploded . Потом снизу будет поле Application context нажимаем и выбираем пустое поле и потом нажимаем ок.
ВСЕ сервер гтотов к запуску!!! И чтобы запустить приложение , запускаем сервер и потом в адресной строке добавляем(что уже прописано в index.jsp) /posting 
и нажимаем enter, все , приложение запущено!
