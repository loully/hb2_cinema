import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import * as L from 'leaflet';


@Injectable({
  providedIn: 'root'
})
export class MarkerService {
  capitals: string = '/assets/image/gobelet';

  constructor(private http: HttpClient) { }

  static scaledRadius(val: number, maxVal: number): number {
    return 20 * (val / maxVal);
  }

  makeCapitalMarkers(map: L.map): L.Marker {
    this.http.get(this.capitals).subscribe((res: any) => {
      for (const c of res.features) {
        const lon = c.geometry.coordinates[0];
        const lat = c.geometry.coordinates[1];
        console.log('lon', lon);
        console.log('lat', lat);

      }
    });

    const marker = L.marker([47.19195, -1.52945]);

    marker.addTo(map);
  }

  makeCapitalCircleMarkers(map: L.map): void {
    this.http.get(this.capitals).subscribe((res: any) => {

      const maxPop = Math.max(...res.features.map(x => x.properties.population), 0);

      for (const c of res.features) {
        const lon = c.geometry.coordinates[0];
        const lat = c.geometry.coordinates[1];
        const circle = L.circleMarker([lat, lon], {
          radius: MarkerService.scaledRadius(c.properties.population, maxPop)
        });

        circle.addTo(map);
      }
    });
  }

}
