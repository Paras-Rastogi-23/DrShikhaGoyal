let rightSideLi = document.querySelectorAll('.btn-pluss ul li img')
let dropdownContent = document.querySelector('.Dropdown_content')

Array.from(rightSideLi).forEach(element => {
    element.addEventListener('mouseover', display)
    element.addEventListener('mouseout', display)
})
let mini = true
function display() {
    if (mini) {
        dropdownContent.style.transform = 'translateX(0)'
        mini = false
    } else {
        dropdownContent.style.transform = 'translateX(150%)'
        mini = true
    }
}
dropdownContent.addEventListener('mouseover',display)

