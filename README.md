# java library



I want to put methods to DatabaseCRUD:
show books
add book
edit book
delete book

To add books and so on i need inputs.
So i want to use html for this. 

<h3> how to run: </h3>
wasd
<h3> how to run: </h3>
just go fast



#how to run this java library app:


1). First of all you want to add config.properties file with username={yourMySQLusername} and password={yourMySQLpassword} (without brackets) to your [src] folder.


2). Then you compile this proj009lib2 with maven


3). Then you start Tomcat


4). Then you create server folder in webapps (it will be {yourTomcatServerFolder})


5). Then you create WEB-INF folder with folders /lib and /classes inside of it


6). Then you start Tomcat and put all files excluding [proj009lib2] from maven generated [target] to your tomcat server folder, but and then put files from maven generated [classes/proj009lib2] to [{yourTomcatServerFolder}/WEB-INF/classes] folder.


7). Then you take Maven generated snapshot of JAR extension and put it into [{yourTomcatServerFolder}/WEB-INF/lib]


8). then you run your server and get to localhost:8080/{yourTomcatServerFolder} and it easily works! ;)

<h2> as simple as that! </h2>