

Project Direction

Download & Install the following

IntelliJ IDEA
Android Studio
Maven

Build




Clone the source code.
Open the source code through IntelliJ IDEA 


Build the project or run the tests from within the IDE.



Build Maven with the following cmd through command prompt

mvn package \ mvn compile

To build Fejoa server

mvn package -pl server -Dmaven.test.skip=true

To start the Fejoa server

java -jar server-1.0-SNAPSHOT-jar-with-dependencies.jar -h localhost -p 8180 -d dataDir

Android App:

Build an app with basic features such as account creation and login

Import the libraries from the fejoa server to the android app.

Functionalities:

1. Sign up a user : Click on the Sign up button, and provide the details of the user such as name and password.

2. Sign in  : Click on the sign in button, provide the log in details.

3. User data : The user details can be viewed once the user logs in with the authenticated details

4. Log off : The click on the log off button will exit the user from the Application.

***Thank You***
Chat conversation end
Type a message...

Choose Files
