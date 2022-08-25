export class Experiencia {
    id?: number;
    nombreE: string;
    descripcionE: string;
    nombreEmp: string;

    constructor( nombreE: string, descripcionE: string, nombreEmp: string ) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmp = nombreEmp;
    }

}
