import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CreateMusicComponent } from './create-music.component';

const routes: Routes = [
  {
    path: '',
    component: CreateMusicComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CreateMusicRoutingModule {}
