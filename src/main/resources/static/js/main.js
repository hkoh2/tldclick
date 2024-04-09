console.log("main.js");

let link = document.getElementById('new-link').innerHTML;
console.log(link);
const copyLink = async () => {
    try {
        document.getElementById('copy-msg').innerHTML = "";
        await navigator.clipboard.writeText(link);
        console.log('copied');
    } catch (e) {
        console.log('coyp error');
        document.getElementById('copy-msg').innerHTML = "Copy error";
    }
}