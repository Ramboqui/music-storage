import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

import { environment } from '../../../environments/environment';
import { IMusicRequest, IMusicResponse } from '../../models/music';

@Injectable({
  providedIn: 'root',
})
export class MusicService {
  private readonly url = `${environment.baseUrl}/api/v1/music`;

  constructor(private readonly httpClient: HttpClient) {}

  postMusic(body: IMusicRequest): Observable<IMusicResponse> {
    return this.httpClient.post<IMusicResponse>(this.url, body);
  }
}
