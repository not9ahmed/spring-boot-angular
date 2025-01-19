import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'summary'
})
export class SummaryPipe implements PipeTransform {

  transform(value: string, limit: number = 40): string | null{
    if(!value){
      return null;
    }
    return value.substring(0, limit) +
    (value.length> limit? "...": "");
  }

}
