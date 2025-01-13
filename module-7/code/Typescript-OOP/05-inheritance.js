var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.introduce = function () {
        console.log("I am ".concat(this.firstName, " ").concat(this.lastName));
    };
    return Person;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(firstName, lastName, grade) {
        var _this = _super.call(this, firstName, lastName) || this;
        _this.grade = grade;
        return _this;
    }
    Student.prototype.introduce = function () {
        // calling super method
        _super.prototype.introduce.call(this);
        console.log("Studying ".concat(this.grade));
    };
    return Student;
}(Person));
var p1 = new Student("Ahmed", "Not", "A");
p1.introduce();
