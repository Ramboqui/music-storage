import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CreateMusicRoutingModule } from './create-music-routing.module';

import { CreateMusicComponent } from './create-music.component';

@NgModule({
  declarations: [CreateMusicComponent],
  exports: [CreateMusicComponent],
  imports: [CommonModule, CreateMusicRoutingModule, FormsModule],
})
export class CreateMusicModule {}
