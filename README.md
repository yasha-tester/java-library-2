# java library



I want to put methods to DatabaseCRUD:
show books
add book
edit book
delete book

And i'll use html forms as input sources

# what im currently doing:

I just added Create Read and Delete functionality.
Next up: 
1) Add Edit
2) Make Read and Delete better (I want to show Read data to the browser and not only to Tomcat console. And i maybe want to rethink Delete function, bc it deletes all the files with specified name, and you might want to delete just one such file for example)
3) Rethink GUI and make it seem a normal app
*4) Write something similar or even functionally the same in JavaFX or React+Java instead of html/jsp. 

<h3> how to run: </h3>
wasd
<h3> how to run: </h3>
just go fast


# how to run this java library app:


1). First of all you want to add config.properties file with username={yourMySQLusername} and password={yourMySQLpassword} (without brackets) to your [src] folder.


2). Then you compile this proj009lib2 with maven


3). Then you start Tomcat


4). Then you create server folder in webapps (it will be {yourTomcatServerFolder})


5). Then you create WEB-INF folder with folders /lib and /classes inside of it


6). Then you start Tomcat and put all files excluding [proj009lib2] from maven generated [target] to your tomcat server folder, but and then put files from maven generated [classes/proj009lib2] to [{yourTomcatServerFolder}/WEB-INF/classes] folder.


7). Then you take Maven generated snapshot of JAR extension and put it into [{yourTomcatServerFolder}/WEB-INF/lib]


8). then you run your server and get to localhost:8080/{yourTomcatServerFolder} and it easily works! ;)

<h2> as simple as that! </h2>


