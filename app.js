const docHeight = document.body.clientHeight;
const viewHeight = window.innerHeight;

document.addEventListener('scroll', () => {
    let nowScroll = window.scrollY;
    document.getElementById("scrollbar").style.setProperty("--scroll-value", 100 * (nowScroll / (docHeight - viewHeight)) + '%');
});