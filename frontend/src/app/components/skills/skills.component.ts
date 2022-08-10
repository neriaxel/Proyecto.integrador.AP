import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  mostrarFront: boolean = false;
  mostrarBack: boolean = false;
  mostrarDise: boolean = false;

  constructor() { }

  ngOnInit(): void {
    
  }

  mostrarFrontend(){
    this.mostrarFront = !this.mostrarFront;
}
  mostrarBackend(){
    this.mostrarBack =! this.mostrarBack;
  }

  mostrarDiseno(){
    this.mostrarDise =! this.mostrarDise;
  }
}