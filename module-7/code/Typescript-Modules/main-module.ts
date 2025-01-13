import { Circle, greet, message as msg} from "./01.module1";
import { Secret } from "./01.module1";

console.log(msg);

const mySecret: Secret = {
    message: "hello",
    secret: "shush"
};

console.log(mySecret);

greet("Ahmed")

const myCircle: Circle = new Circle(4);

const areaOfMyCircle = myCircle.area();

console.log(areaOfMyCircle);

const s: boolean = true;