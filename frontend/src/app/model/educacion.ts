export class Educacion {
    id: number;
    nombreE: string;
    descripcionE: string;
    fechaEI: Date;
    fechaEF: Date;
    

    constructor(nombreE: string, descripcionE: string, fechaEI: Date, fechaEF: Date) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaEI = fechaEI;
        this.fechaEF = fechaEF;
    }
}

