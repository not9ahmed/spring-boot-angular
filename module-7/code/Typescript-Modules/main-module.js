"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var _01_module1_1 = require("./01.module1");
console.log(_01_module1_1.message);
var mySecret = {
    message: "hello",
    secret: "shush"
};
console.log(mySecret);
(0, _01_module1_1.greet)("Ahmed");
var myCircle = new _01_module1_1.Circle(4);
var areaOfMyCircle = myCircle.area();
console.log(areaOfMyCircle);
