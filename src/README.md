# java library


First of all in order for it to work you should add config.properties files with fields "username" and "password".


Currently it has next bug: 

<code>
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.net.URL.getPath()" because the return value of "java.lang.ClassLoader.getResource(String)" is null
	at proj009lib2/proj009lib2.MyCreds.defineCreds(MyCreds.java:13)
	at proj009lib2/proj009lib2.MyLibrary.main(MyLibrary.java:9)
</code>
