import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { ButtonModule } from 'primeng/button';

import { CreateMusicRoutingModule } from './create-music-routing.module';
import { CreateMusicComponent } from './create-music.component';

@NgModule({
  declarations: [CreateMusicComponent],
  exports: [CreateMusicComponent],
  imports: [ButtonModule, CommonModule, CreateMusicRoutingModule, FormsModule],
})
export class CreateMusicModule {}
