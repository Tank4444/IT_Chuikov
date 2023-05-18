package ru.chuikov.it_chuikov.network.entity


import com.google.gson.annotations.SerializedName

data class EdamamResponce(
    @SerializedName("count")
    val count: Int,
    @SerializedName("from")
    val from: Int,
    @SerializedName("hits")
    val hits: List<Hit>,
    @SerializedName("_links")
    val links: Links,
    @SerializedName("to")
    val to: Int
) {
    data class Hit(
        @SerializedName("_links")
        val links: Links,
        @SerializedName("recipe")
        val recipe: Recipe
    ) {
        data class Links(
            @SerializedName("self")
            val self: Self
        ) {
            data class Self(
                @SerializedName("href")
                val href: String,
                @SerializedName("title")
                val title: String
            )
        }

        data class Recipe(
            @SerializedName("calories")
            val calories: Double,
            @SerializedName("cautions")
            val cautions: List<String>,
            @SerializedName("cuisineType")
            val cuisineType: List<String>,
            @SerializedName("dietLabels")
            val dietLabels: List<String>,
            @SerializedName("digest")
            val digest: List<Digest>,
            @SerializedName("dishType")
            val dishType: List<String>,
            @SerializedName("healthLabels")
            val healthLabels: List<String>,
            @SerializedName("image")
            val image: String,
            @SerializedName("images")
            val images: Images,
            @SerializedName("ingredientLines")
            val ingredientLines: List<String>,
            @SerializedName("ingredients")
            val ingredients: List<Ingredient>,
            @SerializedName("label")
            val label: String,
            @SerializedName("mealType")
            val mealType: List<String>,
            @SerializedName("shareAs")
            val shareAs: String,
            @SerializedName("source")
            val source: String,
            @SerializedName("totalDaily")
            val totalDaily: TotalDaily,
            @SerializedName("totalNutrients")
            val totalNutrients: TotalNutrients,
            @SerializedName("totalTime")
            val totalTime: Double,
            @SerializedName("totalWeight")
            val totalWeight: Double,
            @SerializedName("uri")
            val uri: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("yield")
            val yield: Double
        ) {
            data class Digest(
                @SerializedName("daily")
                val daily: Double,
                @SerializedName("hasRDI")
                val hasRDI: Boolean,
                @SerializedName("label")
                val label: String,
                @SerializedName("schemaOrgTag")
                val schemaOrgTag: String,
                @SerializedName("sub")
                val sub: List<Sub>,
                @SerializedName("tag")
                val tag: String,
                @SerializedName("total")
                val total: Double,
                @SerializedName("unit")
                val unit: String
            ) {
                data class Sub(
                    @SerializedName("daily")
                    val daily: Double,
                    @SerializedName("hasRDI")
                    val hasRDI: Boolean,
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("schemaOrgTag")
                    val schemaOrgTag: String,
                    @SerializedName("tag")
                    val tag: String,
                    @SerializedName("total")
                    val total: Double,
                    @SerializedName("unit")
                    val unit: String
                )
            }

            data class Images(
                @SerializedName("LARGE")
                val lARGE: LARGE,
                @SerializedName("REGULAR")
                val rEGULAR: REGULAR,
                @SerializedName("SMALL")
                val sMALL: SMALL,
                @SerializedName("THUMBNAIL")
                val tHUMBNAIL: THUMBNAIL
            ) {
                data class LARGE(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )

                data class REGULAR(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )

                data class SMALL(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )

                data class THUMBNAIL(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
            }

            data class Ingredient(
                @SerializedName("food")
                val food: String,
                @SerializedName("foodCategory")
                val foodCategory: String,
                @SerializedName("foodId")
                val foodId: String,
                @SerializedName("image")
                val image: String,
                @SerializedName("measure")
                val measure: String,
                @SerializedName("quantity")
                val quantity: Double,
                @SerializedName("text")
                val text: String,
                @SerializedName("weight")
                val weight: Double
            )

            data class TotalDaily(
                @SerializedName("CA")
                val cA: CA,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE,
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL,
                @SerializedName("FASAT")
                val fASAT: FASAT,
                @SerializedName("FAT")
                val fAT: FAT,
                @SerializedName("FE")
                val fE: FE,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG,
                @SerializedName("FOLDFE")
                val fOLDFE: FOLDFE,
                @SerializedName("K")
                val k: K,
                @SerializedName("MG")
                val mG: MG,
                @SerializedName("NA")
                val nA: NA,
                @SerializedName("NIA")
                val nIA: NIA,
                @SerializedName("P")
                val p: P,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT,
                @SerializedName("RIBF")
                val rIBF: RIBF,
                @SerializedName("THIA")
                val tHIA: THIA,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA,
                @SerializedName("VITA_RAE")
                val vITARAE: VITARAE,
                @SerializedName("VITB12")
                val vITB12: VITB12,
                @SerializedName("VITB6A")
                val vITB6A: VITB6A,
                @SerializedName("VITC")
                val vITC: VITC,
                @SerializedName("VITD")
                val vITD: VITD,
                @SerializedName("VITK1")
                val vITK1: VITK1,
                @SerializedName("ZN")
                val zN: ZN
            ) {
                data class CA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class CHOCDF(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class CHOLE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class ENERCKCAL(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FASAT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FAT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FIBTG(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FOLDFE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class K(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class MG(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class NA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class NIA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class P(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class PROCNT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class RIBF(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class THIA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class TOCPHA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITARAE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITB12(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITB6A(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITC(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITD(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITK1(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class ZN(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )
            }

            data class TotalNutrients(
                @SerializedName("CA")
                val cA: CA,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF,
                @SerializedName("CHOCDF.net")
                val cHOCDFNet: CHOCDFNet,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE,
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL,
                @SerializedName("FAMS")
                val fAMS: FAMS,
                @SerializedName("FAPU")
                val fAPU: FAPU,
                @SerializedName("FASAT")
                val fASAT: FASAT,
                @SerializedName("FAT")
                val fAT: FAT,
                @SerializedName("FATRN")
                val fATRN: FATRN,
                @SerializedName("FE")
                val fE: FE,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG,
                @SerializedName("FOLAC")
                val fOLAC: FOLAC,
                @SerializedName("FOLDFE")
                val fOLDFE: FOLDFE,
                @SerializedName("FOLFD")
                val fOLFD: FOLFD,
                @SerializedName("K")
                val k: K,
                @SerializedName("MG")
                val mG: MG,
                @SerializedName("NA")
                val nA: NA,
                @SerializedName("NIA")
                val nIA: NIA,
                @SerializedName("P")
                val p: P,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT,
                @SerializedName("RIBF")
                val rIBF: RIBF,
                @SerializedName("SUGAR")
                val sUGAR: SUGAR,
                @SerializedName("SUGAR.added")
                val sUGARAdded: SUGARAdded,
                @SerializedName("Sugar.alcohol")
                val sugarAlcohol: SugarAlcohol,
                @SerializedName("THIA")
                val tHIA: THIA,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA,
                @SerializedName("VITA_RAE")
                val vITARAE: VITARAE,
                @SerializedName("VITB12")
                val vITB12: VITB12,
                @SerializedName("VITB6A")
                val vITB6A: VITB6A,
                @SerializedName("VITC")
                val vITC: VITC,
                @SerializedName("VITD")
                val vITD: VITD,
                @SerializedName("VITK1")
                val vITK1: VITK1,
                @SerializedName("WATER")
                val wATER: WATER,
                @SerializedName("ZN")
                val zN: ZN
            ) {
                data class CA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class CHOCDF(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class CHOCDFNet(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class CHOLE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class ENERCKCAL(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FAMS(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FAPU(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FASAT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FAT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FATRN(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FIBTG(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FOLAC(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FOLDFE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class FOLFD(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class K(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class MG(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class NA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class NIA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class P(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class PROCNT(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class RIBF(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class SUGAR(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class SUGARAdded(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class SugarAlcohol(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class THIA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class TOCPHA(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITARAE(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITB12(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITB6A(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITC(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITD(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class VITK1(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class WATER(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )

                data class ZN(
                    @SerializedName("label")
                    val label: String,
                    @SerializedName("quantity")
                    val quantity: Double,
                    @SerializedName("unit")
                    val unit: String
                )
            }
        }
    }

    data class Links(
        @SerializedName("next")
        val next: Next
    ) {
        data class Next(
            @SerializedName("href")
            val href: String,
            @SerializedName("title")
            val title: String
        )
    }
}