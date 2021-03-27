import {Component} from '@angular/core';

@Component({
  selector: 'bm-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  about: string;

  constructor() {
    this.about = 'Some information about me and this website...';
  }
}
