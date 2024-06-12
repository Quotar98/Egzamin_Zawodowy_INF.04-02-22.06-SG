import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  kursy: string[] = ["Programowanie w C#", "Angular dla początkujących", "Kurs Django"];
  nazwa: string = '';
  numerKursu: number = 0;

  onSubmit(){

    if(this.numerKursu > 0 && this.numerKursu < 4){
      console.log(this.nazwa);
      console.log(this.kursy [this.numerKursu - 1]);
    }
    else{
      console.log("Nieprawidłowy numer kursu");
    }
    
  }
}
