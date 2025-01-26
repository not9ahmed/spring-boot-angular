import { CanDeactivateFn } from '@angular/router';

export const unsavedGuard: CanDeactivateFn<unknown> = (component: any, currentRoute, currentState, nextState) => {


  // component.myForm.dirty means the form has been touched
  if(component && component.myForm && component.myForm.dirty) {
    
      const result = confirm("Are you sure to leave this register page");
      if (result) {
        return true
      }

      return false;
  }
  
  return false;
};
