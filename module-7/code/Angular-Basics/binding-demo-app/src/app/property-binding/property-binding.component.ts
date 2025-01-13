import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  imports: [],
  templateUrl: './property-binding.component.html',
  styleUrl: './property-binding.component.css'
})
export class PropertyBindingComponent {
  webUrl: string = "https://google.com";
  picUrl: string = "images/icons8-typescript-480.png";
  picHeight: number = 150;
  isDisabled: boolean = false;
}
