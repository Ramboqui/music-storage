import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { IMusicRequest } from '../../models/music';
import { MusicService } from '../../services/music/music.service';

@Component({
  selector: 'create-music',
  templateUrl: './create-music.component.html',
  styleUrls: ['./create-music.component.scss'],
  encapsulation: ViewEncapsulation.None,
})
export class CreateMusicComponent implements OnInit {
  musicRequest: IMusicRequest = {name: '', composer: ''};

  constructor(private readonly musicService: MusicService) {}

  ngOnInit(): void {}

  createMusic() {
    this.musicService.postMusic(this.musicRequest).subscribe({next: (r) => {
      alert('Funcionou!\n' + JSON.stringify(r))
    }})
  }
}
