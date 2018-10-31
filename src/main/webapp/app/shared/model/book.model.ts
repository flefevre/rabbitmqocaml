export interface IBook {
    id?: string;
    title?: string;
}

export class Book implements IBook {
    constructor(public id?: string, public title?: string) {}
}
