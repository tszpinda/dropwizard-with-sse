'use strict';
(function (angular) {

	var app = angular.module('App', []);

	app.controller("MainController", ['$scope', function($scope){
		$scope.hello = "mistrz!";
		
		  var es = new EventSource("sse");
	      var listener = function (event) {
	          var div = document.createElement("div");
	          var type = event.type;
	          div.appendChild(document.createTextNode(type + ": " + (type === "message" ? event.data : es.url)));
	          document.body.appendChild(div);
	        };
	        es.addEventListener("open", listener);
	        es.addEventListener("message", listener);
	        es.addEventListener("error", listener);
	}]);

	


})(angular);

