import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  imports: [],
  templateUrl: './event-binding.component.html',
  styleUrl: './event-binding.component.css'
})
export class EventBindingComponent {
  
  picUrl: string = "images/icons8-typescript-480.png";
  picHeight: number = 150;


  count: number = 0;
  increment(step: number = 1){
    this.count += step;
  }

  changeImageUrl() {
    if (this.picUrl == "images/icons8-javascript-480.png") {
      this.picUrl = "images/icons8-typescript-480.png";
    } else {
      this.picUrl = "images/icons8-javascript-480.png";
    }
  }
}
