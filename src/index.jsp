<html>
<head>
<title>LIBRARY</title>
</head>
<body>
<h2>Hello library!</h2>
<p>Text</p>

<form action="RequestHandler">
<input type="submit" value="Request Handler">
</form>

<form action="ReadBooks" method="post">
<input type="submit" value="Read Books">
</form>


<form action="CreateBook" method="post">
<input type="text" name="title" value="title">
<input type="text" name="author" value="author">
<input type="submit" value="Create Book">
</form>

<form action="DeleteBook" method="post">
<input type="text" name="title" value="title">
<input type="text" name="author" value="author">
<input type="submit" value="Delete Book">
</form>

<form action="EditBook" method="post">
    Edit book
<input type="text" name="title" value="title">
<input type="text" name="author" value="author">


to
<input type="text" name="editedTitle" value="title">
<input type="text" name="editedAuthor" value="author">
<input type="submit" value="Edit Book">
</form>

</body>
</html>