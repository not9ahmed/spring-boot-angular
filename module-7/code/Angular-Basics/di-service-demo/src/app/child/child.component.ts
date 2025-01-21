import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {

  // To recieve value from parent component
  @Input() parentMessage: string = '';


  // To send message to parent
  @Output() messageEvent =  new EventEmitter<string>();


  sendMessage() {
    this.messageEvent.emit("Hello, Parent message from child");
  }
}
