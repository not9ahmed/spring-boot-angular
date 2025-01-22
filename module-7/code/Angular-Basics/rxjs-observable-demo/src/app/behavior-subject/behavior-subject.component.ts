import { Component } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Component({
  selector: 'app-behavior-subject',
  imports: [],
  templateUrl: './behavior-subject.component.html',
  styleUrl: './behavior-subject.component.css'
})
export class BehaviorSubjectComponent {
  

  // using BehaviorSubject which can attach message to subject
  // and subscribers can recieve the values
  subject = new BehaviorSubject('inital value');
  subscribersCount = 0;
  valueCount = 0;

  // add subsribers to subjects
  doSubscribe() {
    let currentCount = this.subscribersCount;
    this.subject.subscribe(value => console.log(`Subscriber ${currentCount}: ${value}`));
    this.subscribersCount++;
  }

  // Generate new value to subject
  doNewValue() {
    this.subject.next(`New value: ${this.valueCount}`);
    this.valueCount++;
  }
}
