import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { EmailService } from 'src/app/service/email.service';

@Component({
  selector: 'app-email',
  templateUrl: './email.component.html',
  styleUrls: ['./email.component.css']
})
export class EmailComponent {

  data = {
    to: "",
    subject: "",
    message: ""
  };

  constructor(private email: EmailService, private snak: MatSnackBar) {}

  async doSubmitForm() {
    console.log("hello");
    console.log(this.data);

    if (this.data.to === '' || this.data.subject === '' || this.data.message === '') {
      this.snak.open("Fields cannot be empty", "Fill them");
      return;
    }

    try {
      const response = await this.email.sendEmail(this.data).toPromise();
      console.log(response);
    } catch (error) {
      console.error(error);
    }
  }
}
