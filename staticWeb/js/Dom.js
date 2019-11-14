<!--
  Created: Amau
  Time: 2019-11-13 15:47:19
-->
/*about this keywords*/
/*
let address = {
    company: "CableTV",
    city: "Vientiane", state: "up", fullAddress: function () {
        return this.company + " " + this.city + " " + this.state;
    }
};
let fetch=address.fullAddress();
/!*
document.writeln(fetch);*!/
console.log(fetch);
*/

let emp_address={
    fullAddress:function () {
        return this.aaa+" "+this.bbb+" "+this.ccc;
    }
};
let address={aaa:"lao cable TV",bbb:"Vientiane",ccc:"up"};
console.log(emp_address.fullAddress().call(address));
console.log(emp_address.fullAddress().apply(address));