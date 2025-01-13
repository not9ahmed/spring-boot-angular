/* Interfaces */

// Method 1
interface ICourse {
    title: string,
    studentCount: number,
    price: number
}

// Method 2
type ICourse2 =  {
    title: string,
    studentCount: number,
    price: number
}



const course: ICourse = {
    title: "Typescript",
    studentCount: 30,
    price: 30
}


const courses: ICourse[] = [
    {
        title: "Typescript",
        studentCount: 30,
        price: 30
    },
    {
        title: "Java",
        studentCount: 40,
        price: 50
    }
]


console.log(course);
console.log(courses);
