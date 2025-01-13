// Exporting messages from this file to main
export const message: string = "Hello world from module 01";

export interface Secret {
    message: string,
    secret: string
}


export function greet(message: string){
    console.log("Hello " + message);
}

export class Circle {
    private readonly PI: number = 3.14;
    constructor(private radius: number) { }

    public area() {
        return this.PI * (this.radius ** 2);
    }
}