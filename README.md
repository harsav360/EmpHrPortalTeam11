Welcome to Team11 Application. 
Pre-requisite to run this application in your System.
   * JDK
   * Spring Suite
   * MySQL Workbench or XAMPP
   

Open your Spring Suite ID and Clone this repository in your selected project Folder
   Steps to Clone -> Spring Suite -> Windows -> Show View -> Others -> Git -> Repository -> Clone Repository from web (Also add Clone sub-modules) -> Choose Folder in System -> Working Tree -> Import Project

This application is Spring Security role base authorization. So first time when you run this application, refresh your MYSQL workbench here in selected schema you
will find 6 tables.
        *Branches
        *Departments
        *Employees
        *Roles
        *Users
        *user_role (Refrencing table)
So to enter inside the application first you have to update the Users, Roles and user_role table manually from the database (We are working on it, how to configure them
from GUI) and When you update the password please insert it in Encrypted Format (You can use online tool or We are also pasting a java code for password encoder).
For Ex :
User -> <img width="430" alt="user" src="https://user-images.githubusercontent.com/51308620/215083879-7b2b84b1-dd84-4087-9f6f-66ac17a1796e.png">


Role -> <img width="411" alt="role" src="https://user-images.githubusercontent.com/51308620/215084323-51007470-619e-4fe5-9b5b-63dfeedf655d.png">


user_role -> <img width="392" alt="user_role" src="https://user-images.githubusercontent.com/51308620/215084557-709aed55-e446-43fc-8cce-bac97dc95164.png">




Java Code for password Encoder (Run this program inside your testing area of project)

package com.graymatter.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "12345678";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);

	}

}

After Completing the above steps, you will successfully sign in inside the application.

Main Application Visual : 


HR Portal


<img width="960" alt="hr1" src="https://user-images.githubusercontent.com/51308620/215085710-3541a81f-c868-47e2-bc24-669af874d005.png">
<img width="953" alt="hr2" src="https://user-images.githubusercontent.com/51308620/215086029-7458fa92-f40d-416a-98fe-4036f1c961a3.png">
<img width="954" alt="hr3" src="https://user-images.githubusercontent.com/51308620/215086077-033d0b1d-a7b7-481f-9eaf-f407a3231023.png">
<img width="948" alt="hr4" src="https://user-images.githubusercontent.com/51308620/215086122-0182613e-5270-47d6-ad11-4a17afc7dfec.png">
<img width="948" alt="hr5" src="https://user-images.githubusercontent.com/51308620/215086180-f1a69eb4-4dca-4f47-b038-f123aec18eb9.png">
<img width="942" alt="hr6" src="https://user-images.githubusercontent.com/51308620/215086212-8a3e9c74-e31e-451e-a400-45747ecddd01.png">
<img width="944" alt="hr7" src="https://user-images.githubusercontent.com/51308620/215086251-e8ef7688-1c3b-4905-9ee0-a6572cefb8c3.png">


Employee - Portal:


<img width="957" alt="emp1" src="https://user-images.githubusercontent.com/51308620/215086627-c938af63-e7e4-4fa0-b751-dae8dd04e1ed.png">
<img width="954" alt="emp2" src="https://user-images.githubusercontent.com/51308620/215087104-d3ef30d9-6658-4d3b-89ed-25d6d894eb9d.png">

To use the mail option, please use some other email service provider other than google, because due to security constraints, google remove the authentication process
from the apps that require email address and password both.(Latest update 2022)





        

