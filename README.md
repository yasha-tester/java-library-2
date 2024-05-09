# java library


First of all in order for it to work you should add config.properties files with fields "username" and "password" your src folder or your proj009lib2 folder (as it doesn't work bc of a bug its hard to tell yet)


Currently it has next bug: 

<code>
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.net.URL.getPath()" because the return value of "java.lang.ClassLoader.getResource(String)" is null
	at proj009lib2/proj009lib2.MyCreds.defineCreds(MyCreds.java:13)
	at proj009lib2/proj009lib2.MyLibrary.main(MyLibrary.java:9)
</code>

but if you change 

<code>String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();</code>

to

<code>String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();</code>

then it'll give this error

<code>Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.net.URL.getPath()" because the return value of "java.lang.ClassLoader.getResource(String)" is null
	at proj009lib2/proj009lib2.MyCreds.defineCreds(MyCreds.java:14)
	at proj009lib2/proj009lib2.MyLibrary.main(MyLibrary.java:9)
</code>