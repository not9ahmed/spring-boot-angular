"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Circle = exports.message = void 0;
exports.greet = greet;
// Exporting messages from this file to main
exports.message = "Hello world from module 01";
function greet(message) {
    console.log("Hello " + message);
}
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
        this.PI = 3.14;
    }
    Circle.prototype.area = function () {
        return this.PI * (Math.pow(this.radius, 2));
    };
    return Circle;
}());
exports.Circle = Circle;
