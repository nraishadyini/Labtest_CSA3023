<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book a Training Session</title>
</head>
<body>
    <h2>Book Training Session</h2>
    <form method="POST" action="BookSessionServlet">
        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="student_name" required>
        <br><br>
        <label for="branchLocation">Branch Location:</label>
        <input type="text" id="branchLocation" name="branch_location" required>
        <br><br>

        <label for="lessonType">Lesson Type:</label>
        <input type="text" id="lessonType" name="lesson_type" placeholder="e.g. Theory, Practical" required>
        <br><br>

        <input type="submit" value="Book Session">
    </form>
</body>