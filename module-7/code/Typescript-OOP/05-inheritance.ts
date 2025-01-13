class Person {

    constructor(private firstName: string, private lastName: string) {
            this.firstName = firstName;
            this.lastName = lastName;
    }

    protected introduce(): void {
        console.log(`I am ${this.firstName} ${this.lastName}`)
    }
}


class Student extends Person {

    constructor(firstName: string, lastName: string, private grade: string) {
        super(firstName, lastName);
    }

    public introduce(): void {

        // calling super method
        super.introduce();
        console.log(`Studying ${this.grade}`)
    }

}

const p1 = new Student("Ahmed", "Not", "A");
p1.introduce();