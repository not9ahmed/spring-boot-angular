import { Component } from '@angular/core';
import { filter, from, map } from 'rxjs';

@Component({
  selector: 'app-transformation-operators',
  imports: [],
  templateUrl: './transformation-operators.component.html',
  styleUrl: './transformation-operators.component.css'
})
export class TransformationOperatorsComponent {

  mapOperatorDemo() {
    const source = from([1,2,3,4,5, 6]);
    const afterMap = source.pipe(
      map(
        (value) => value * 10
      )
    );

    afterMap.subscribe(value => console.log(value));
  }


  filterOperatorDemo() {
    const source = from([1,2,3,4,5,6]);

    source
          .pipe(filter(value => value%2 == 0))
          .subscribe(value => console.log(value));
  }
}
