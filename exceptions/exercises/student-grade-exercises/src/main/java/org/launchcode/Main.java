package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int x = 10;
        int y = 2;

        try {
            int result = Divide(x, y);
            System.out.println(x + "/" + y + ": " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            int points = CheckFileExtension(fileName);
            System.out.println(student + " receives " + points + " point ");
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!

        try {
            return x/y;
        } catch( ArithmeticException e){
            throw new ArithmeticException("Cannot divide by zero");
        }

    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int pointsForJavaFiles = 1;
        int pointsForOtherFiles = 0;
        int pointsForEmptyFiles = -1;
        try {
            if(fileName == null || fileName.isEmpty()){
                throw new InvalidFileException("File Name cannot be null or empty");
            }
            if (fileName.endsWith(".java")) {
                return pointsForJavaFiles;
            } else  {
                return pointsForOtherFiles;
            }
        } catch (InvalidFileException e) {
                return pointsForEmptyFiles;
            }
        }
    }
