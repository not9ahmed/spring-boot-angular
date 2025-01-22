import { Component } from '@angular/core';
import { catchError, map, of, retry } from 'rxjs';

@Component({
  selector: 'app-error-operators',
  imports: [],
  templateUrl: './error-operators.component.html',
  styleUrl: './error-operators.component.css'
})
export class ErrorOperatorsComponent {


  // catch an error once the map operator failed on any subscribers
  catchErrorOperatorDemo() {

    const source = of(1, 2, 3, 'four');

    source.pipe(
      map(
        (val) => {
          if (typeof val == 'string') {
            throw new Error("Value is a string");
          }
          return val
        }

        // to catch errors during the map
        // the value will be 0 once it reached 'four'
      ),catchError(error => {
        console.log("Error message at catchError " + error);
        return of(0);
      })
    ).subscribe(
      (value) => console.log(value)
    );


  }


  // Retry the map for n number of times
  retryOperator() {

    const source = of(1, 2, 3, 'four');

    source.pipe(
      map(
        (val) => {
          if (typeof val == 'string') {
            throw new Error("Value is a string");
          }
          return val
        }


      ),
      // retry the map 2 time
      retry(2)
    ).subscribe(
      (value) => console.log(value)
    );
  }


}
