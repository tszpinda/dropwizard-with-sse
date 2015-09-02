<#-- @ftlvariable name="" type="org.ahedstrom.example.WebsiteView" -->
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>SSE</title>

		<link rel="stylesheet" href="/static/vendor/css/bootstrap.min.css">

		<script type="text/javascript" src="/static/vendor/js/jquery.min.js"></script>
		<script type="text/javascript" src="/static/vendor/js/angular.js"></script>
		<script type="text/javascript" src="/static/vendor/js/bootstrap.min.js"></script>

		<script type="text/javascript" src="/static/app/app.js"></script>
		
		<!--[if lt IE 9]>
		<script src="/static/html5shiv.min.js"></script>
		<script src="/static/respond.min.js"></script>
		<![endif]-->
	</head>
	<body ng-app="App">
        <div class="container main-content" ng-controller="MainController">
        	{{hello}}
        </div>
	</body>
</html>