import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-help',
  templateUrl: './help.component.html',
  styleUrls: ['./help.component.css']
})
export class HelpComponent implements OnInit {

  //isHidden:boolean = true;
  
  constructor() { }

  ngOnInit(): void {
  }

  /**
   * Event listener : on click, display the hidden text
   * @param dots 
   * @param more 
   * @param btnDisplayMore 
   */
  onClickForDisplay(dots:string, more:string, btnDisplayMore:string){

    let jsDots = <HTMLElement>document.getElementById(dots);
    let jsMoreText = <HTMLElement>document.getElementById(more);
    let jsBtnText = <HTMLElement>document.getElementById(btnDisplayMore);
  
    if (jsDots.style.display === 'none' && jsDots && jsBtnText && jsMoreText) {
      jsDots.style.display = 'inline';
      jsBtnText.innerHTML = 'Voir la réponse';
      jsMoreText.style.display = 'none';
    } else {
      jsDots.style.display = 'none';
      jsBtnText.innerHTML = 'Voir moins';
      jsMoreText.style.display = 'inline';
    }
    //this.isHidden = !this.isHidden;
  }

}
