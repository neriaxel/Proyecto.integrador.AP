export class Experiencia {
    id?: number;
    nombreE: string;
    descripcionE: string;
    nombreEmp: string;
    fechaEI: Date;
    fechaEF: Date;


    constructor( nombreE: string, descripcionE: string, nombreEmp: string, fechaEI: Date, fechaEF: Date) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmp = nombreEmp;
        this.fechaEI = fechaEI;
        this.fechaEF = fechaEF;
    }

}
