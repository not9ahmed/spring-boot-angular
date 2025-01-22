import { Component } from '@angular/core';
import { from, Observable, of } from 'rxjs';

@Component({
  selector: 'app-creation-operators',
  imports: [],
  templateUrl: './creation-operators.component.html',
  styleUrl: './creation-operators.component.css'
})
export class CreationOperatorsComponent {


  // creating observable using Obserable constructor
  observableUsingConstructor() {
    const myObservable = new Observable(observer => {

      // Passing values to the observable
      observer.next("Next value from Observer 1");
      observer.next("Next value from Observer 2");
      observer.next("Next value from Observer 3");
      
      // observer.error("Error happened");

      // indicating that the task is complete
      observer.complete();

      // This will not be executed as it's complete
      observer.next("Next value from Observer 3");

    });



    // Subscribing to Observable
    myObservable.subscribe({
      next: (value) => console.log(value),
      error: (error) => console.error(error),
      complete: () => console.log("completed")
    })

  }

  // Observable creation using Of operation
  observableUsingOf() {

    // passing multiple values
    const myObservable = of("Next value from observable", "Another value")

    // will get the next value
    myObservable.subscribe((value) => console.log(value));

    // will automatically use complete
  }


  // Observable using from
  // Will take an array
  observableUsingFrom() {
    const arrayOfObservables = from([1, 2, 3, 4, 5])
    arrayOfObservables.subscribe((value) => console.log(value))
  }

}
