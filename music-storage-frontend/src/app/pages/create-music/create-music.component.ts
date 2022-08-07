import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { MusicService } from '../../services/music/music.service';

@Component({
  selector: 'create-music',
  templateUrl: './create-music.component.html',
  styleUrls: ['./create-music.component.scss'],
  encapsulation: ViewEncapsulation.None,
})
export class CreateMusicComponent implements OnInit {
  constructor(private readonly musicService: MusicService) {}

  ngOnInit(): void {}
}
