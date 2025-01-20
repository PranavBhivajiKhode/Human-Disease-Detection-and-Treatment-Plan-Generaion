<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <title>Detect Disease</title>
	</head>
	<body>
	    <h2>Upload an Image for Disease Detection</h2>
	    <form action="uploadImage" method="post" enctype="multipart/form-data">
	        <!-- Input for file upload -->
	        <label for="imageFile">Select an image:</label>
	        <input type="file" name="imageFile" id="imageFile" accept="image/*" required>
	        <br><br>
	        <!-- Submit button -->
	        <button type="submit">Upload</button>
	    </form>
	</body>
</html>
