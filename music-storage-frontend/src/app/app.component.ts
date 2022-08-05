import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'music-storage-frontend';

  items: MenuItem[] = [
    { label: 'Home' },
    { label: 'test1' },
    { label: 'test2' },
    { label: 'test3' },
  ];
}
