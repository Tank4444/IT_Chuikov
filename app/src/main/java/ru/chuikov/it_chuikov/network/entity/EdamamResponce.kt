package ru.chuikov.it_chuikov.network.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EdamamResponce(
    @SerialName("count")
    val count: Int,
    @SerialName("from")
    val from: Int,
    @SerialName("hits")
    val hits: List<Hit>,
    @SerialName("_links")
    val links: Links,
    @SerialName("to")
    val to: Int
) {
    @Serializable
    data class Hit(
        @SerialName("_links")
        val links: Links,
        @SerialName("recipe")
        val recipe: Recipe
    ) {
        @Serializable
        data class Links(
            @SerialName("self")
            val self: Self
        ) {
            @Serializable
            data class Self(
                @SerialName("href")
                val href: String,
                @SerialName("title")
                val title: String
            )
        }

        @Serializable
        data class Recipe(
            @SerialName("calories")
            val calories: Double,
            @SerialName("cautions")
            val cautions: List<String>,
            @SerialName("cuisineType")
            val cuisineType: List<String>,
            @SerialName("dietLabels")
            val dietLabels: List<String>,
            @SerialName("digest")
            val digest: List<Digest>,
            @SerialName("dishType")
            val dishType: List<String>,
            @SerialName("healthLabels")
            val healthLabels: List<String>,
            @SerialName("image")
            val image: String,
            @SerialName("images")
            val images: Images,
            @SerialName("ingredientLines")
            val ingredientLines: List<String>,
            @SerialName("ingredients")
            val ingredients: List<Ingredient>,
            @SerialName("label")
            val label: String,
            @SerialName("mealType")
            val mealType: List<String>,
            @SerialName("shareAs")
            val shareAs: String,
            @SerialName("source")
            val source: String,
            @SerialName("totalDaily")
            val totalDaily: TotalDaily,
            @SerialName("totalNutrients")
            val totalNutrients: TotalNutrients,
            @SerialName("totalTime")
            val totalTime: Double,
            @SerialName("totalWeight")
            val totalWeight: Double,
            @SerialName("uri")
            val uri: String,
            @SerialName("url")
            val url: String,
            @SerialName("yield")
            val yield: Double
        ) {
            @Serializable
            data class Digest(
                @SerialName("daily")
                val daily: Double,
                @SerialName("hasRDI")
                val hasRDI: Boolean,
                @SerialName("label")
                val label: String,
                @SerialName("schemaOrgTag")
                val schemaOrgTag: String,
                @SerialName("sub")
                val sub: List<Sub>,
                @SerialName("tag")
                val tag: String,
                @SerialName("total")
                val total: Double,
                @SerialName("unit")
                val unit: String
            ) {
                @Serializable
                data class Sub(
                    @SerialName("daily")
                    val daily: Double,
                    @SerialName("hasRDI")
                    val hasRDI: Boolean,
                    @SerialName("label")
                    val label: String,
                    @SerialName("schemaOrgTag")
                    val schemaOrgTag: String,
                    @SerialName("tag")
                    val tag: String,
                    @SerialName("total")
                    val total: Double,
                    @SerialName("unit")
                    val unit: String
                )
            }

            @Serializable
            data class Images(
                @SerialName("LARGE")
                val lARGE: LARGE,
                @SerialName("REGULAR")
                val rEGULAR: REGULAR,
                @SerialName("SMALL")
                val sMALL: SMALL,
                @SerialName("THUMBNAIL")
                val tHUMBNAIL: THUMBNAIL
            ) {
                @Serializable
                data class LARGE(
                    @SerialName("height")
                    val height: Int,
                    @SerialName("url")
                    val url: String,
                    @SerialName("width")
                    val width: Int
                )

                @Serializable
                data class REGULAR(
                    @SerialName("height")
                    val height: Int,
                    @SerialName("url")
                    val url: String,
                    @SerialName("width")
                    val width: Int
                )

                @Serializable
                data class SMALL(
                    @SerialName("height")
                    val height: Int,
                    @SerialName("url")
                    val url: String,
                    @SerialName("width")
                    val width: Int
                )

                @Serializable
                data class THUMBNAIL(
                    @SerialName("height")
                    val height: Int,
                    @SerialName("url")
                    val url: String,
                    @SerialName("width")
                    val width: Int
                )
            }

            @Serializable
            data class Ingredient(
                @SerialName("food")
                val food: String,
                @SerialName("foodCategory")
                val foodCategory: String,
                @SerialName("foodId")
                val foodId: String,
                @SerialName("image")
                val image: String,
                @SerialName("measure")
                val measure: String,
                @SerialName("quantity")
                val quantity: Double,
                @SerialName("text")
                val text: String,
                @SerialName("weight")
                val weight: Double
            )

            @Serializable
            data class TotalDaily(
                @SerialName("CA")
                val cA: CA,
                @SerialName("CHOCDF")
                val cHOCDF: CHOCDF,
                @SerialName("CHOLE")
                val cHOLE: CHOLE,
                @SerialName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL,
                @SerialName("FASAT")
                val fASAT: FASAT,
                @SerialName("FAT")
                val fAT: FAT,
                @SerialName("FE")
                val fE: FE,
                @SerialName("FIBTG")
                val fIBTG: FIBTG,
                @SerialName("FOLDFE")
                val fOLDFE: FOLDFE,
                @SerialName("K")
                val k: K,
                @SerialName("MG")
                val mG: MG,
                @SerialName("NA")
                val nA: NA,
                @SerialName("NIA")
                val nIA: NIA,
                @SerialName("P")
                val p: P,
                @SerialName("PROCNT")
                val pROCNT: PROCNT,
                @SerialName("RIBF")
                val rIBF: RIBF,
                @SerialName("THIA")
                val tHIA: THIA,
                @SerialName("TOCPHA")
                val tOCPHA: TOCPHA,
                @SerialName("VITA_RAE")
                val vITARAE: VITARAE,
                @SerialName("VITB12")
                val vITB12: VITB12,
                @SerialName("VITB6A")
                val vITB6A: VITB6A,
                @SerialName("VITC")
                val vITC: VITC,
                @SerialName("VITD")
                val vITD: VITD,
                @SerialName("VITK1")
                val vITK1: VITK1,
                @SerialName("ZN")
                val zN: ZN
            ) {
                @Serializable
                data class CA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class CHOCDF(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class CHOLE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class ENERCKCAL(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FASAT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FAT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FIBTG(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FOLDFE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class K(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class MG(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class NA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class NIA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class P(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class PROCNT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class RIBF(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class THIA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class TOCPHA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITARAE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITB12(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITB6A(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITC(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITD(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITK1(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class ZN(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )
            }

            @Serializable
            data class TotalNutrients(
                @SerialName("CA")
                val cA: CA,
                @SerialName("CHOCDF")
                val cHOCDF: CHOCDF,
                @SerialName("CHOCDF.net")
                val cHOCDFNet: CHOCDFNet,
                @SerialName("CHOLE")
                val cHOLE: CHOLE,
                @SerialName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL,
                @SerialName("FAMS")
                val fAMS: FAMS,
                @SerialName("FAPU")
                val fAPU: FAPU,
                @SerialName("FASAT")
                val fASAT: FASAT,
                @SerialName("FAT")
                val fAT: FAT,
                @SerialName("FATRN")
                val fATRN: FATRN,
                @SerialName("FE")
                val fE: FE,
                @SerialName("FIBTG")
                val fIBTG: FIBTG,
                @SerialName("FOLAC")
                val fOLAC: FOLAC,
                @SerialName("FOLDFE")
                val fOLDFE: FOLDFE,
                @SerialName("FOLFD")
                val fOLFD: FOLFD,
                @SerialName("K")
                val k: K,
                @SerialName("MG")
                val mG: MG,
                @SerialName("NA")
                val nA: NA,
                @SerialName("NIA")
                val nIA: NIA,
                @SerialName("P")
                val p: P,
                @SerialName("PROCNT")
                val pROCNT: PROCNT,
                @SerialName("RIBF")
                val rIBF: RIBF,
                @SerialName("SUGAR")
                val sUGAR: SUGAR,
                @SerialName("SUGAR.added")
                val sUGARAdded: SUGARAdded,
                @SerialName("Sugar.alcohol")
                val sugarAlcohol: SugarAlcohol,
                @SerialName("THIA")
                val tHIA: THIA,
                @SerialName("TOCPHA")
                val tOCPHA: TOCPHA,
                @SerialName("VITA_RAE")
                val vITARAE: VITARAE,
                @SerialName("VITB12")
                val vITB12: VITB12,
                @SerialName("VITB6A")
                val vITB6A: VITB6A,
                @SerialName("VITC")
                val vITC: VITC,
                @SerialName("VITD")
                val vITD: VITD,
                @SerialName("VITK1")
                val vITK1: VITK1,
                @SerialName("WATER")
                val wATER: WATER,
                @SerialName("ZN")
                val zN: ZN
            ) {
                @Serializable
                data class CA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class CHOCDF(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class CHOCDFNet(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class CHOLE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class ENERCKCAL(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FAMS(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FAPU(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FASAT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FAT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FATRN(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FIBTG(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FOLAC(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FOLDFE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class FOLFD(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class K(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class MG(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class NA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class NIA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class P(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class PROCNT(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class RIBF(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class SUGAR(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class SUGARAdded(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class SugarAlcohol(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class THIA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class TOCPHA(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITARAE(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITB12(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITB6A(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITC(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITD(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class VITK1(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class WATER(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )

                @Serializable
                data class ZN(
                    @SerialName("label")
                    val label: String,
                    @SerialName("quantity")
                    val quantity: Double,
                    @SerialName("unit")
                    val unit: String
                )
            }
        }
    }

    @Serializable
    data class Links(
        @SerialName("next")
        val next: Next
    ) {
        @Serializable
        data class Next(
            @SerialName("href")
            val href: String,
            @SerialName("title")
            val title: String
        )
    }
}