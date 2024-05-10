# java library


First of all in order for it to work you should add config.properties files with fields "username" and "password" into your src folder.

I want to put methods to DatabaseCRUD:
show books
add book
edit book
delete book

To add books and so on i need inputs.
So i want to use jsp for this. 

I might need to import mysql-connector one more time for maven, but this far it works as it is.
So now i want to link my form from JSP with a Servlet.

when i build i get next error:

<code>
...

...
Failed to deploy artifacts/metadata: Cannot access /home/yasha-user/projectsFolder/codes/eclipseWorkspaceDir/proj009lib2/newRepo1 with type default using the available connector factories: BasicRepositoryConnectorFactory: Cannot access /home/yasha-user/projectsFolder/codes/eclipseWorkspaceDir/proj009lib2/newRepo1 using the registered transporter factories: HttpTransporterFactory, FileTransporterFactory, WagonTransporterFactory
...

...
</code>