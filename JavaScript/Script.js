function myObject() { this.property1 = "value1"; 
this.property2 = "value2"; 
var newValue = this.property1;  
this.performMethod = function() { myMethodValue = newValue; return myMethodValue; }; } 
var myObjectInstance = new myObject(); alert(myObjectInstance.performMethod());