# **My First Gui**

   Hello, welcome to my first ever GUI project that I completed in Computer Programming II at Jacksonville State University. This program was written in the programming language Java, and it was compiled using an integrated development environment called NetBeans. This program is meant to give the user a brief introduction into creating GUI programs. As written, the program will open up a small 500 by 500 pixels window and print thirty random shapes of varying sizes. The program's random shapes include a circle, rectangle, and triangle. Each of these shapes will have its area printed at its center.
   
   ![lab5d](https://user-images.githubusercontent.com/44220245/47520596-3737f000-d856-11e8-8aba-436b34602055.PNG)

### **Installation**

  In order to install this project on your own computer, simply click on the link named Lab5D.zip, click download, and save the folder to a designated place on your computer.

### **Usage**

  If you would like to run this program on your own computer, you have two options. The first, and easiest option, is to open the project folder, open the folder named dist, and double click the executable jar file named LAB5D. Every time the jar file is opened there will be thirty newly generated shapes in a new window. Secondly, the other option consists of downloading the integrated development environment, NetBeans. In order for NetBeans to work properly, you must first visit oracles website and download Java. The first link is to download Java, and the second is to download NetBeans. 
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

https://netbeans.org/downloads/

  Once you have Java and NetBeans downloaded, you will open NetBeans. Next, you will find and open the project folder that you downloaded in Installation. Lastly, you will click the clean and build project icon at the top left of the screen and the green play button icon to the right of it, to run the program.
  
  ![image](https://user-images.githubusercontent.com/44220245/47520853-fee4e180-d856-11e8-9eb2-45e0e03bf872.png)

### **Background**

  This section simply gives a brief understanding of how java programs are written and created. If you already have a decent understanding, feel free to move on to the next section named Design. First Java programs are created by using java classes. These classes can be compared to multiple sheets of paper for an assignment. Every Java program requires and begins with a main class. This main class is the executable starting point of your program. Other classes are made to make the program and main class concise and easy to read and understand. Whenever all of your classes are completed, each of these classes work together to make your program run successfully. 

### **Design**

  My project consists of seven java classes that all work together to complete the program. This section will discuss each of these classes, individually, to give a detailed description of how my program works. These classes are named: Lab5D.java, Main.java, Point.java, Shape.java, Circle.java, Rectangle.java, and Triangle.java. The Circle, Rectangle, and Triangle class are all subclasses of the Shape class. This means they contain all the properties and characteristics of the Shape class and others that make them unique. 
  
  ![classes](https://user-images.githubusercontent.com/44220245/47520772-b75e5580-d856-11e8-9740-e8b5de3ad4ab.PNG)


	Point.java
  
  The point class is designed so that the user can effectively pinpoint the center of a shape. Point takes three integer arguments x, y, and z. X corresponds to the x-axis on a graph, y corresponds to the y-axis on a graph, and z corresponds to the z-axis. The z-axis is an added axis to represent depth. Inside the constructor of the point class, if statements are used to ensure that x and y are greater than or equal to zero and less than or equal to five hundred. The point class contains getter methods for x, y, and z to work with these instance fields. The object, point, is implemented in the shape class in order for all subclasses, or shapes, to utilize the point object.

	Shape.java
  
  The Shape class is an abstract class that implements the Point object to find the center of each shape. The shape class also allows each shape subclass to use the area() method which is a function that finds each shape’s area. First, Shape.java initializes an instance field named center which is of type Point. The constructor takes in three integer arguments x, y, and z and inserts these values into the variable center. Lastly, Shape.java implements getter methods for each of these arguments.

	Circle.java
  
  The Circle class is a subclass of Shape.java. The Circle constructor accepts three integer arguments x, y, and z. It also accepts one double named newRadius. The constructor also sets a private instance field radius equal to newRadius. Circle contains several methods. Among these are area, circumference, and toString. Area calculates the area of the circle, circumference calculates the circumference, and toString prints a brief representation of a circle with its corresponding center. Lastly, the Circle class contains a getter and setter method for radius which ensures that the radius is greater than or equal to zero and returns it for other use in the program.

	Rectangle.java
  
  The Rectangle class is also a subclass of Shape.java. First, Rectangle.java initializes two private instance fields named width and height. Next, the Rectangle constructor accepts three integer arguments: x, y, and z, and two double arguments: width and height. the arguments x, y, and z are inserted into the super class which allows them to be read as a shape. Then, getters and setters are implemented for both width and height which get the width and height arguments from the constructor and set the instance fields equal to those values. An area method is added which calculates the area of the rectangle. Lastly, a toString method is created which prints a brief representation of the rectangle, its area, and its center.

	Lab5D.java
  
  Lab5D.java is where all the graphics and numbers are generated. First, a for loop is created which randomly generates and adds thirty shapes to the array list called shapes. Among these thirty shapes are also randomly generated arguments. Next, a for loop is created which iterates through each shape and decides whether it’s a circle, rectangle, or triangle. If the shape is a circle, the program draws a yellow circle by using the fillOval method. This method positions the circle and its printed center correctly. If the shape is a rectangle, the program draws a firebrick red rectangle using the fillRect method. This method positions the rectangle and its printed center correctly. If the Shape is a triangle, the program draws a green triangle by using the fillPolygon method. This method is much more attention consuming than the others because there is not a method for printing a triangle. In this method, lines are drawn from three points which each connect and create a triangle. Lastly, Lab5D.java prints the area of each shape in an orange font color. 

	Main.java
  
  Main.java is the starting point of the program. This class opens up a 500 by 500 pixel Gui window and implements Lab5D.java as the windows contents.
